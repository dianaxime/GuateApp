package Modelos

class Places {
    private lateinit var title: String
    fun Places(usetitle: String) {
        title = usetitle
    }

    fun gettitle(): String? {
        if (title == "Antigua") {
            return "Antigua"
        } else if (title == "Tikal") {
            return "Tikal"
        } else if (title == "Atitlan") {
            return "Atitlan"
        }
        return null
    }

    fun getfrase(): String? {
        if (title == "Antigua") {
            return "La ciudad de Santiago de los Caballeros de Guatemala"
        } else if (title == "Tikal") {
            return "Es uno de los mayores yacimientos arqueológicos y centros urbanos de la civilización maya precolombina"
        } else if (title == "Atitlan") {
            return "El accidente hidrográfico más importante del departamento de Sololá"
        }
        return null
    }

    fun gettext(): String? {
        if (title == "Antigua") {
            return "Antigua Guatemala, es cabecera del municipio homónimo y del departamento de Sacatepéquez, Guatemala; se ubica a aproximadamente 25 kilómetros al oeste de la capital de la República de Guatemala, y a una altitud de 1470 msnm.\n" +
                    "\n" +
                    "Durante la época de la colonia era conocida como Santiago de los Caballeros de Guatemala, y fue la capital de la Capitanía General de Guatemala, entre 1541 y 1776, año en que la capital fue trasladada a la ciudad de Nueva Guatemala de la Asunción luego que los terremotos de Santa Marta arruinaran la ciudad por tercera ocasión en el mismo siglo y las autoridades civiles utilizaran eso como excusa para debilitar a las autoridades eclesiásticas siguiendo las recomendaciones de las Reformas Borbónicas emprendidas por la corona española en la segunda mitad del siglo XVIII obligando a las órdenes regulares a trasladarse de sus majestuosos conventos a frágiles estructuras temporales en la nueva ciudad.\n" +
                    "\n" +
                    "A partir del traslado la ciudad pasó a llamarse «arruinada Guatemala», «Santiago de Guatemala antiguo» y la «antigua ciudad». Fue abandonada por todas las autoridades reales y municipales, y en 1784 por las dos últimas parroquias: Candelaria y Nuestra Señora de los Remedios, quedándose también sin autoridades eclesiásticas. Pocos años después el arzobispo Cayetano Francos y Monroy autorizó el funcionamiento de tres parroquias interinas que llevaron el nombre de sus antecesoras: San Sebastián, Candelaria y Los Remedios, en donde se guardó la mayor cantidad de obras de arte religioso que permaneció en la antigua Guatemala.\n" +
                    "\n" +
                    "Tras la Independencia de Centroamérica en 1821 recuperó la categoría de ciudad y fue nombrada como cabecera del departamento de Sacatepéquez. Así mismo, el Estado de Guatemala estableció circuitos y distritos para la impartición de justicia por medio de juicios de jurados en 1825, y Antigua Guatemala fue asignada como sede del circuito homónimo en el Distrito N.º8 (Sacatepéquez).\n" +
                    "\n" +
                    "La ciudad fue designada como Patrimonio de la Humanidad por la UNESCO en 1979.\n" +
                    "\n" +
                    "En el siglo XXI es un importante destino turístico guatemalteco por su bien preservada arquitectura barroca española con fachadas barrocas del Nuevo Mundo, así como un gran número de ruinas de iglesias católicas, incluso aún después de que sus estructuras fueran severamente dañadas por el abandono en que estuvieron entre 1776 y 1940 y por los terremotos de 1874, de 1917 y de 1976. También es reconocida por las solemnes procesiones de Semana Santa que se han realizado anualmente desde antes del traslado de la capital a la Nueva Guatemala. De acuerdo al censo oficial de 2003, tiene una población de 44 097 habitantes.\n"
        } else if (title == "Tikal") {
            return " Está situado en el municipio de Flores, en el departamento de Petén, en el territorio actual de la República de Guatemala y forma parte del Parque nacional Tikal, que fue declarado Patrimonio de la Humanidad, por Unesco, en 1979. Según los glifos encontrados en el yacimiento, su nombre maya habría sido Yax Mutul.\n" +
                    "\n" +
                    "Tikal fue la capital de un estado beligerante, que se convirtió en uno de los reinos más poderosos de los antiguos mayas. Aunque la arquitectura monumental del sitio se remonta hasta el siglo IV a. C., Tikal alcanzó su apogeo durante el Período Clásico, entre el 200 y el 900 d. C. Durante este tiempo, la ciudad dominó gran parte de la región maya, en el ámbito político, económico y militar y mantenía vínculos con otras regiones, a lo largo de Mesoamérica, incluso con la gran metrópoli de Teotihuacan, en el lejano Valle de México.\n" +
                    "\n" +
                    "Después del Clásico Tardío, no se construyeron monumentos mayores.\n" +
                    "\n" +
                    "Con una larga lista de gobernantes dinásticos, el descubrimiento de muchas de sus respectivas tumbas y el estudio de sus monumentos, templos y palacios, Tikal es probablemente la mejor comprendida de las grandes ciudades mayas de las tierras bajas de Mesoamérica.\n"
        } else if (title == "Atitlan") {
            return "Es una de las principales fuentes económicas del departamento, pues además de ser un centro turístico de mucho atractivo, sirve de mucho apoyo comercial.\n" +
                    "\n" +
                    "En los márgenes del lago se alzan los volcanes de Atitlán (3537 msnm), Tolimán (3158 msnm) y volcán San Pedro (3020 msnm). El lago está situado a 1560 metros sobre el nivel del mar y tiene 18 km de longitud. Su profundidad, que varía en muchos puntos, es desconocida, sin embargo se han sondeado más de 350 metros de profundidad.\n"
        }
        return null
    }
}
