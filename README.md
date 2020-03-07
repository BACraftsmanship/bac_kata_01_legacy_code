# Agregando nueva funcionalidad a un código heredado
  
## Indice

- [Foco de la kata](#foco-de-la-kata)
- [Lineamientos](#Lineamientos)
- [Descripción funcional del problema](#descripción-funcional-del-problema)
- [Respecto a las tecnolgocías](#respecto-a-las-tecnolgocías)
- [Configuración de los ambientes de desarrollo](#configuración-de-los-ambientes-de-desarrollo)
- [Colaboradores](#colaboradores)
  
## Foco de la kata

Agregar una nueva funcionanlidad a un código, que no cuenta con pruebas automatizadas, reduciendo el riego del impacto de la modificación. 

Dividiremos la actividad en las siguientes fases:

1. Escrituras de pruebas que incrementen la cobertura (characterization test)
2. Agregar nueva característica (feature)

## Lineamientos

[Presentación][kata_01_legacy_code]

## Descripción funcional del problema

Un comerciante necesita conocer el margen de ganancia que tiene al momento de vender un producto (ej.: Mirinda de 600ml) que ha comprado a un precio `X` vendiendolo a un precio `Y`. La ganancia será igual a `Y - X`

Puede comprar un producto por:

1. Unidad
2. A granel (un pack).

Con la información anterior podríamos pensar en los casos de uso:

1. Comerciante compra una gaseosa a **200**, la vende a **350** y la renta es de **150**
2. Comerciante compra *100* gaseosa a **500**, la vende a **100** y la renta es de **95**
3. Cliente paga con una `Vaca` y la ganancia es la `Vaca`

## Respecto a las tecnolgocías

A continuación listamos las tecnolgocías soportadas para esta kata:

| Tecnología                | Configuración del entorno de desarrollo |
| ----------                | --------------------------------------- |
| [java](/tecnologias/java) | [java + maven](/tecnologias/java/maven/kata-01-legacy-code/README.md)   |
| [nodejs](/tecnologias/nodejs) | [nodejs + yarn + jest](/tecnologias/nodejs/README.md)   |
| [kotlin ](/tecnologias/kotlin) | [java + maven](/tecnologias/kotlin/gradle/kata-01-legacy-code/README.md)   |

Debido a que cada tecnolgocía tiene sus particularidades cada una de ellas tendrá una Configuración particular que podrá encontrarse en la carpeta específica para cada una de ellas.

> NOTA: Si necesitan agregar una nueva tecnolgocía puede hacer a través de un [PR][PR]. Contactarse con [diegosanchez][slack_diegosanchez] para mayor información.

## Colaboradores

- [danielmaldonado](https://github.com/maldonadod)
- [diegosanchez](https://github.com/diegosanchez)

[PR]: https://help.github.com/es/github/collaborating-with-issues-and-pull-requests/about-pull-requests
[kata_01_legacy_code]: https://docs.google.com/presentation/d/1vBhbeofyAWflItnfvbxufMioiO6toPZ8VFt5LV86Fts/edit?usp=sharing
[slack_diegosanchez]: https://bacraftsmanship.slack.com/archives/DMGTNRS3D
