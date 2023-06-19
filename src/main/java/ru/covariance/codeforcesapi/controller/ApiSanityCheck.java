package ru.covariance.codeforcesapi.controller;

import java.util.List;
import ru.covariance.codeforcesapi.CodeforcesApi;
import ru.covariance.codeforcesapi.CodeforcesApiException;
import ru.covariance.codeforcesapi.constants.CodeForcesConstants;
import ru.covariance.codeforcesapi.entities.Hack;

public class ApiSanityCheck {

  public static void main(String[] args) throws CodeforcesApiException {
    CodeforcesApi apiReader = new CodeforcesApi(CodeForcesConstants.API_KEY, CodeForcesConstants.API_SECRET);
//    apiReader.
    List<Hack> list = apiReader.contestHacks(566);
    System.out.println(list.toString());
  }

  private static void customCall() throws CodeforcesApiException {
    CodeforcesApi apiReader = new CodeforcesApi(CodeForcesConstants.API_KEY,
        CodeForcesConstants.API_SECRET, "en");

  }
}
