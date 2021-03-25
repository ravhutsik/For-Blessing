@cm_mediaVideo

Feature: view WF media

  Scenario: as a user i want to be able to view and play video's
    Given i am at the WF home page and i click on the MEDIA link
    When i click on the VIDEO link
    And i validate if the video can display and play
