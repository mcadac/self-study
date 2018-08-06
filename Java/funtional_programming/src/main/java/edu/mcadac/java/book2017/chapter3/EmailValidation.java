/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */
package edu.mcadac.java.book2017.chapter3;

import edu.mcadac.java.book2017.chapter3.Result.Failure;
import java.util.function.Function;
import java.util.regex.Pattern;

public class EmailValidation {

  static Pattern emailPattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  final static Function<String, Boolean> emailChecker = s -> emailPattern.matcher(s).matches();

  final static Function<String, Result> emailChecker_2 = s -> {

    if(s == null){
      return new Result.Failure("Email must no be null");
    } else if (s.length() == 0){
      return new Failure("Email must no be empty");
    } else if(emailPattern.matcher(s).matches()){
      return new Result.Success();
    } else{
      return new Result.Failure("Email is invalid");
    }

  };


  final static Function<String, Result> emailChecker_3 = email ->
      (email == null) ? new Result.Failure("Email must no be null") :
          (email.length() == 0) ? new Failure("Email must no be empty") :
              (emailPattern.matcher(email).matches()) ? new Result.Success() : new Result.Failure("Email is invalid");


  final static Function<String, NewResult<String>> emailChecker_4 = email ->
      (email == null) ? NewResult.failure("Email must no be null") :
          (email.length() == 0) ? NewResult.failure("Email must no be empty") :
              (emailPattern.matcher(email).matches()) ? NewResult.success(email) : NewResult.failure("Email is invalid");


  static void sendVerificationEmail(final String email){
    System.out.println("Verification email : " + email);
  }

  private static void logError(final String message){
    System.out.println("Error message : " + message);
  }



  static void testMail(final String email){

    if(emailPattern.matcher(email).matches()){
      sendVerificationEmail(email);
    }else{
      logError(email + "is invalid");
    }
  }


  static void testMailWith_checker(final String email){

    if (emailChecker.apply(email)){
      sendVerificationEmail(email);
    }else{
      logError(email + "is invalid");
    }

  }


  static void validate_emailChecker_2(final String email){

    final Result result = emailChecker_2.apply(email);

    if(result instanceof Result.Success){
      sendVerificationEmail(email);
    }else {
      logError(((Result.Failure)result).getMessage());
    }

  }


  static Executable validate_emailChecker_3(final String email){

    final Result result = emailChecker_3.apply(email);

    return (result instanceof Result.Success) ?
        () -> sendVerificationEmail(email) :
        () -> logError(((Result.Failure)result).getMessage());

  }


  static Effect<String> success = s -> System.out.println("Mail sent to: " + s);
  static Effect<String> failure = s -> System.out.println("Error message logged : " + s);


  public static void main(String... args){

    System.out.println("====================== Normal check  =======================");

    validate_emailChecker_2("this.is@my.email");
    validate_emailChecker_2(null);
    validate_emailChecker_2("");
    validate_emailChecker_2("johne@acme.co");

    System.out.println("====================== Check 3 with exec  =======================");

    validate_emailChecker_3("this.is@my.email").exec();
    validate_emailChecker_3(null).exec();
    validate_emailChecker_3("");
    validate_emailChecker_3("johne@acme.co").exec();


    System.out.println("====================== Check 4 using NewResult =======================");

    emailChecker_4.apply("this.is@my.email").isSuccess(success, failure);
    emailChecker_4.apply(null).isSuccess(success, failure);
    emailChecker_4.apply("").isSuccess(success, failure);
    emailChecker_4.apply("johne@acme.co").isSuccess(success, failure);

  }



}
