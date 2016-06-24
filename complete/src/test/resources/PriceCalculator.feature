Feature: Price Calculation

  Scenario: comprar solo un libro, sin descuento
    When yo compro 1 copia de "Condorito I"
    Then el total es 8000

  Scenario: comprar dos libros distintos
    When yo compro 1 copia de "Condorito I"
    And yo compro 1 copia de "Condorito II"
    Then el total es 15200
#
#  Scenario: comprar dos libros distintos y uno igual
#    When yo compro 1 copia de "Condorito I"
#    And yo compro 2 copia de "Conorito II"
#    Then el total es 23200
#
#
#  Scenario Outline:
#    When yo compro <I> copia de "Condorito I"
#      And yo compro <II> copia de "Condorito II"
#      And yo compro <III> copia de "Condorito III"
#      And yo compro <IV> copia de "Condorito IV"
#      And yo compro <V> copia de "Condorito V"
#    Then el total es <total>
#
#      Examples:
#      |I|II|III|IV|V|total|
#      |1|0 |0  |0 |0|8000 |
#      |1|1 |0  |0 |0|15200|
#      |1|2 |0  |0 |0|23200|