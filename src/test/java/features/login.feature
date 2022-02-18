@Author Jose Arroyo

@Login
Feature: Como usuario de newtours
  Quiero ingresar al sitio web
  Para/con el objetivo de realizar compras

  @LoginExitoso
  Scenario Outline: Intento de realizar login exitoso en la web de new tours
    Given Que <nombre> esta en la web de new tours
    When Diligencia el formulario del ingreso a la web
      |user|pass|
      |<user>|<pass>|
    Then y vera el mensaje <msn_login>

    Examples:
      |nombre|user|pass|msn_login|
      |Jose|jos123|prueba123|Login Successfully|