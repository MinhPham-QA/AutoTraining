@all_activities
Feature: Math

  Background:
    Given Minh is at home

  @scenario_outline
  Scenario Outline: sum of 2 integer numbers
    Given There are 2 integer numbers
    When <a> + <b>
    Then Sum of <a> + <b> should be <sum>

    Examples:
      |  a   |  b  |  sum  |
      | -22  |  3  |  -19  |
      |  4   |  7  |   11  |
      |  6   |  9  |   15  |

  @scenario_outline
  Scenario Outline: difference between 2 integer numbers
    Given There are 2 integer numbers
    When <a> - <b>
    Then Difference between <a> - <b> should be <difference>

    Examples:
      |  a   |  b  |  difference  |
      | -22  |  3  |     -25      |
      |  18  |  7  |      11      |
      |  6   |  9  |      -3      |


  @scenario_outline
  Scenario Outline: product of 2 integer numbers
    Given There are 2 integer numbers
    When <a> * <b>
    Then Product of <a> * <b> should be <product>

    Examples:
      |  a   |  b  |  product  |
      | -12  |  4  |   -48     |
      |  9   |  8  |    72     |
      |  6   |  0  |     0     |


  @scenario_outline
  Scenario Outline: quotient of 2 integer numbers
    Given There are 2 integer numbers
    When <a> / <b>
    Then Quotient of <a> / <b> should be <quotient>

    Examples:
      |  a    |  b  |  quotient  |
      | -12   |  4  |     -3     |
      | 172   |  3  |     57     |
      |   9   |  0  |      0     |