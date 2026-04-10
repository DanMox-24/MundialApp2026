package com.mundial2026.app;

import java.util.ArrayList;
import java.util.List;

public class TeamsData {

    public static List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();

        // ===== CONMEBOL (6 equipos) =====
        teams.add(new Team(
                "Argentina", "🇦🇷", "CONMEBOL", "Por sortear",
                "Lionel Scaloni", "Buenos Aires", "#1",
                "18 apariciones", "Campeón (1978, 1986, 2022)",
                "Estadio Monumental",
                "La Albiceleste llega como campeona vigente del mundo. Liderada por Lionel Messi, es una de las favoritas del torneo con una generación brillante que busca defender el título obtenido en Qatar 2022."
        ));
        teams.add(new Team(
                "Brasil", "🇧🇷", "CONMEBOL", "Por sortear",
                "Dorival Júnior", "Brasilia", "#5",
                "22 apariciones", "Campeón (1958, 1962, 1970, 1994, 2002)",
                "Estadio Maracaná",
                "La Canarinha es el equipo más ganador de la historia del Mundial con 5 títulos. Con jóvenes talentos como Vinicius Jr. y Rodrygo, Brasil busca el hexacampeonato en suelo norteamericano."
        ));
        teams.add(new Team(
                "Uruguay", "🇺🇾", "CONMEBOL", "Por sortear",
                "Marcelo Bielsa", "Montevideo", "#18",
                "14 apariciones", "Campeón (1930, 1950)",
                "Estadio Centenario",
                "La Celeste es la selección más ganadora proporcionalmente. Con Darwin Núñez y Rodrigo Bentancur, Uruguay siempre es un equipo difícil de vencer y apunta a la gloria en 2026."
        ));
        teams.add(new Team(
                "Colombia", "🇨🇴", "CONMEBOL", "Por sortear",
                "Néstor Lorenzo", "Bogotá", "#9",
                "7 apariciones", "Cuartos de final (1990, 2014)",
                "Estadio El Campín",
                "Los Cafeteros llegan en excelente momento tras alcanzar la final de Copa América 2024. Con James Rodríguez y Luis Díaz, Colombia es una de las selecciones más emocionantes del torneo."
        ));
        teams.add(new Team(
                "Ecuador", "🇪🇨", "CONMEBOL", "Por sortear",
                "Sebastián Beccacece", "Quito", "#35",
                "4 apariciones", "Segunda ronda (2006)",
                "Estadio Rodrigo Paz Delgado",
                "La Tri clasificó de manera sólida al mundial. Con Enner Valencia como referente histórico y jóvenes promesas, Ecuador busca superar su mejor actuación mundialista en 2026."
        ));
        teams.add(new Team(
                "Paraguay", "🇵🇾", "CONMEBOL", "Por sortear",
                "Por definir", "Asunción", "#56",
                "9 apariciones", "Cuartos de final (2010)",
                "Estadio Defensores del Chaco",
                "La Albirroja es un clásico del fútbol sudamericano. Paraguay regresa a la Copa del Mundo con la ilusión de repetir o superar su histórica actuación en Sudáfrica 2010."
        ));

        // ===== UEFA (16 equipos) =====
        teams.add(new Team(
                "España", "🇪🇸", "UEFA", "Por sortear",
                "Luis de la Fuente", "#3", "Por sortear",
                "16 apariciones", "Campeón (2010)",
                "Estadio Santiago Bernabéu",
                "La Roja llega como campeona de la Eurocopa 2024. Con Lamine Yamal como estrella emergente y un brillante colectivo, España busca revalidar su título mundial de Sudáfrica 2010."
        ));
        teams.add(new Team(
                "Francia", "🇫🇷", "UEFA", "Por sortear",
                "Didier Deschamps", "París", "#2",
                "16 apariciones", "Campeón (1998, 2018)",
                "Estadio de Francia",
                "Les Bleus son bicampeones del mundo y llegan con Kylian Mbappé como su gran estrella. Francia es considerada una de las principales candidatas al título en el Mundial 2026."
        ));
        teams.add(new Team(
                "Alemania", "🇩🇪", "UEFA", "Por sortear",
                "Julian Nagelsmann", "Berlín", "#12",
                "20 apariciones", "Campeón (1954, 1974, 1990, 2014)",
                "Allianz Arena",
                "Die Mannschaft es una potencia histórica con 4 títulos mundiales. Alemania busca recuperar su nivel tras decepciones recientes y volver a conquistar la cima del fútbol mundial."
        ));
        teams.add(new Team(
                "Portugal", "🇵🇹", "UEFA", "Por sortear",
                "Roberto Martínez", "Lisboa", "#6",
                "9 apariciones", "Tercer lugar (1966)",
                "Estádio da Luz",
                "Portugal llega con Cristiano Ronaldo posiblemente en su último Mundial. Con una generación brillante que incluye a Bernardo Silva y Bruno Fernandes, los lusos buscan su primer título mundial."
        ));
        teams.add(new Team(
                "Inglaterra", "🏴󠁧󠁢󠁥󠁮󠁧󠁿", "UEFA", "Por sortear",
                "Lee Carsley", "Londres", "#5",
                "16 apariciones", "Campeón (1966)",
                "Wembley Stadium",
                "Los Tres Leones buscan su segundo título 60 años después de 1966. Con Jude Bellingham y Harry Kane liderando una generación excepcional, Inglaterra tiene más esperanzas que nunca."
        ));
        teams.add(new Team(
                "Países Bajos", "🇳🇱", "UEFA", "Por sortear",
                "Ronald Koeman", "Ámsterdam", "#7",
                "11 apariciones", "Finalista (1974, 1978, 2010)",
                "Johan Cruyff Arena",
                "La Naranja Mecánica nunca ha ganado un Mundial a pesar de tres finales. Con Virgil van Dijk y Cody Gakpo, Holanda quiere convertir el sueño en realidad en 2026."
        ));
        teams.add(new Team(
                "Bélgica", "🇧🇪", "UEFA", "Por sortear",
                "Domenico Tedesco", "Bruselas", "#3",
                "14 apariciones", "Tercer lugar (2018)",
                "Estadio Rey Balduino",
                "Los Diablos Rojos buscan aprovechar lo que queda de su generación dorada. Con De Bruyne y Lukaku, Bélgica siempre es un equipo a tener en cuenta en cualquier competición."
        ));
        teams.add(new Team(
                "Italia", "🇮🇹", "UEFA", "Por sortear",
                "Luciano Spalletti", "Roma", "#9",
                "18 apariciones", "Campeón (1934, 1938, 1982, 2006)",
                "Estadio Olímpico de Roma",
                "Gli Azzurri son tetracampeones del mundo y llegan renovados tras el trauma de no clasificar en 2018. Italia busca recuperar el nivel que la llevó al título en Alemania 2006."
        ));
        teams.add(new Team(
                "Croacia", "🇭🇷", "UEFA", "Por sortear",
                "Zlatko Dalić", "Zagreb", "#11",
                "7 apariciones", "Subcampeón (2018)",
                "Stadion Maksimir",
                "La Vatreni sorprendió al mundo en 2018 llegando a la final. Con Luka Modrić y una generación experimentada, Croacia busca llegar aún más lejos en el Mundial de Norteamérica."
        ));
        teams.add(new Team(
                "Suiza", "🇨🇭", "UEFA", "Por sortear",
                "Murat Yakin", "Berna", "#20",
                "12 apariciones", "Cuartos de final (1934, 1938, 1954)",
                "Estadio de Ginebra",
                "La Nati es conocida por su solidez defensiva y su fútbol organizado. Suiza es siempre un equipo muy difícil de vencer en fase eliminatoria como demostró en Qatar 2022."
        ));
        teams.add(new Team(
                "Austria", "🇦🇹", "UEFA", "Por sortear",
                "Ralf Rangnick", "Viena", "#25",
                "7 apariciones", "Tercer lugar (1954)",
                "Estadio Ernst Happel",
                "Austria regresa al Mundial con una generación ilusionante. Con David Alaba y un equipo muy bien organizado por Rangnick, los austríacos buscan superar la fase de grupos."
        ));
        teams.add(new Team(
                "Escocia", "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "UEFA", "Por sortear",
                "Steve Clarke", "Edimburgo", "#30",
                "8 apariciones", "Segunda ronda (1982)",
                "Hampden Park",
                "Los Bravos regresan al Mundial tras décadas de ausencia. Con un espíritu combativo y varios jugadores de Premier League, Escocia quiere demostrar que merece estar en la élite mundial."
        ));
        teams.add(new Team(
                "Serbia", "🇷🇸", "UEFA", "Por sortear",
                "Dragan Stojković", "Belgrado", "#33",
                "13 apariciones (como Yugoslavia+Serbia)", "Tercer lugar (1930, 1962)",
                "Estadio Rajko Mitić",
                "Serbia llega con Dušan Vlahović como referente ofensivo. Los serbios han demostrado un fútbol de alto nivel y buscan superar la fase de grupos en su segunda aparición como selección independiente."
        ));
        teams.add(new Team(
                "Polonia", "🇵🇱", "UEFA", "Por sortear",
                "Michał Probierz", "Varsovia", "#28",
                "9 apariciones", "Tercer lugar (1974, 1982)",
                "Estadio Nacional de Polonia",
                "Polska llega con Robert Lewandowski posiblemente en su último Mundial. El veterano delantero sigue siendo uno de los mejores del mundo y quiere despedirse a lo grande en 2026."
        ));
        teams.add(new Team(
                "Dinamarca", "🇩🇰", "UEFA", "Por sortear",
                "Brian Riemer", "Copenhague", "#22",
                "6 apariciones", "Cuartos de final (1998)",
                "Parken Stadium",
                "Los daneses son un equipo muy sólido y difícil de batir. Con Christian Eriksen y una generación talentosa, Dinamarca busca volver a sorprender como lo hizo en la Eurocopa 1992."
        ));
        teams.add(new Team(
                "Rumanía", "🇷🇴", "UEFA", "Por sortear",
                "Edward Iordănescu", "Bucarest", "#46",
                "7 apariciones", "Cuartos de final (1994)",
                "Arena Națională",
                "Rumanía regresa al Mundial aprovechando su gran actuación en la Eurocopa 2024. Con una mezcla de experiencia y juventud, los rumanos buscan sorprender como en el Mundial de EE.UU. 1994."
        ));

        // ===== CONCACAF (6 equipos) =====
        teams.add(new Team(
                "Estados Unidos", "🇺🇸", "CONCACAF", "Por sortear",
                "Gregg Berhalter", "Washington D.C.", "#13",
                "11 apariciones", "Semifinal (1930)",
                "Rose Bowl Stadium",
                "La USMNT es uno de los anfitriones del Mundial 2026. Con una generación excepcional que incluye a Christian Pulisic y Gio Reyna, EE.UU. tiene la presión y la ilusión de brillar en casa."
        ));
        teams.add(new Team(
                "México", "🇲🇽", "CONCACAF", "Por sortear",
                "Javier Aguirre", "Ciudad de México", "#15",
                "17 apariciones", "Cuartos de final (1970, 1986)",
                "Estadio Azteca",
                "El Tri es uno de los anfitriones y tiene la presión enorme de avanzar de la maldición de quinto partido. Con el Azteca de escenario, México busca superar los cuartos de final por primera vez."
        ));
        teams.add(new Team(
                "Canadá", "🇨🇦", "CONCACAF", "Por sortear",
                "Jesse Marsch", "Ottawa", "#48",
                "2 apariciones", "Primera ronda (1986)",
                "BMO Field",
                "Canadá es el tercer anfitrión y llega en su mejor momento histórico. Con Alphonso Davies y Jonathan David, los canadienses quieren aprovechar la ventaja local para hacer historia en 2026."
        ));
        teams.add(new Team(
                "Costa Rica", "🇨🇷", "CONCACAF", "Por sortear",
                "Gustavo Alfaro", "San José", "#55",
                "6 apariciones", "Cuartos de final (2014)",
                "Estadio Nacional",
                "Los Ticos ya demostraron al mundo de lo que son capaces en Brasil 2014. Con un juego colectivo muy disciplinado, Costa Rica busca repetir la hazaña y llegar a los cuartos de final o más."
        ));
        teams.add(new Team(
                "Honduras", "🇭🇳", "CONCACAF", "Por sortear",
                "Por definir", "Tegucigalpa", "#80",
                "3 apariciones", "Segunda ronda (2010)",
                "Estadio Olímpico Metropolitano",
                "Honduras regresa al Mundial con el sueño de superar su actuación de 2010. Con un fútbol físico y trabajador, los catrachos buscan la clasificación a la siguiente ronda."
        ));
        teams.add(new Team(
                "Jamaica", "🇯🇲", "CONCACAF", "Por sortear",
                "Por definir", "Kingston", "#55",
                "2 apariciones", "Segunda ronda (1998)",
                "Independence Park",
                "Los Reggae Boyz regresan al Mundial por segunda vez en su historia. Con varios jugadores que militan en ligas europeas y de América del Norte, Jamaica busca superar los grupos."
        ));

        // ===== CAF (9 equipos) =====
        teams.add(new Team(
                "Marruecos", "🇲🇦", "CAF", "Por sortear",
                "Walid Regragui", "Rabat", "#14",
                "7 apariciones", "Semifinal (2022)",
                "Gran Estadio de Tánger",
                "Los Leones del Atlas hicieron historia en Qatar 2022 llegando a semifinales. Marruecos es la revelación africana del fútbol mundial y llega como una de las sorpresas más gratas del torneo."
        ));
        teams.add(new Team(
                "Senegal", "🇸🇳", "CAF", "Por sortear",
                "Aliou Cissé", "Dakar", "#16",
                "4 apariciones", "Semifinal (2002)",
                "Estadio Léopold Sédar Senghor",
                "Los Leones de Teranga son la selección más fuerte de África actualmente. Con Sadio Mané y un equipo experimentado, Senegal busca llegar lejos en el Mundial de Norteamérica."
        ));
        teams.add(new Team(
                "Nigeria", "🇳🇬", "CAF", "Por sortear",
                "Finidi George", "Abuja", "#34",
                "7 apariciones", "Cuartos de final (1994)",
                "Estadio Nacional de Abuja",
                "Las Super Águilas son uno de los equipos más talentosos de África. Con Victor Osimhen como delantero referente y una rica tradición futbolística, Nigeria busca regresar a los cuartos de final."
        ));
        teams.add(new Team(
                "Costa de Marfil", "🇨🇮", "CAF", "Por sortear",
                "Emerse Faé", "Yamoussoukro", "#27",
                "4 apariciones", "Segunda ronda (2006, 2022)",
                "Estadio de Ebimpé",
                "Los Elefantes de Costa de Marfil llegan como campeones de la Copa Africana de Naciones 2023. Con Sébastien Haller recuperado y un equipo muy competitivo, buscan superar la segunda ronda."
        ));
        teams.add(new Team(
                "Egipto", "🇪🇬", "CAF", "Por sortear",
                "Hossam Hassan", "El Cairo", "#37",
                "4 apariciones", "Segunda ronda (1934)",
                "Estadio Internacional de El Cairo",
                "Los Faraones regresan al Mundial con Mohamed Salah como gran estrella. Egipto tiene el potencial de causar sorpresas con su jugador de Liverpool que sigue siendo uno de los mejores del mundo."
        ));
        teams.add(new Team(
                "Camerún", "🇨🇲", "CAF", "Por sortear",
                "Marc Brys", "Yaundé", "#42",
                "9 apariciones", "Cuartos de final (1990)",
                "Estadio Olímpico de Yaundé",
                "Los Leones Indomables son una potencia histórica africana. Camerún llega con Vincent Aboubakar y busca repetir o superar la histórica actuación de Italia 1990 cuando llegaron a cuartos de final."
        ));
        teams.add(new Team(
                "Ghana", "🇬🇭", "CAF", "Por sortear",
                "Otto Addo", "Accra", "#67",
                "4 apariciones", "Cuartos de final (2010)",
                "Estadio Olímpico de Accra",
                "Las Black Stars son otro de los equipos históricos africanos. Ghana llega con la ilusión de volver a llegar a cuartos como en Sudáfrica 2010 cuando estuvo cerca de ser el primer equipo africano en semifinales."
        ));
        teams.add(new Team(
                "Sudáfrica", "🇿🇦", "CAF", "Por sortear",
                "Hugo Broos", "Pretoria", "#60",
                "4 apariciones", "Segunda ronda (2010)",
                "FNB Stadium",
                "Bafana Bafana regresa al Mundial como anfitrión espiritual del fútbol africano. Sudáfrica busca superar la segunda ronda que lograron como locales en 2010 y demostrar el crecimiento del fútbol en el continente."
        ));
        teams.add(new Team(
                "Malí", "🇲🇱", "CAF", "Por sortear",
                "Éric Sékou Chelle", "Bamako", "#50",
                "1 aparición", "Segunda ronda (2002)",
                "Estadio 26 de Marzo",
                "Malí llega a su segundo Mundial en la historia. Con una generación de jóvenes talentos que juegan en Europa, los Águilas de Malí buscan hacer historia y avanzar en la Copa del Mundo 2026."
        ));

        // ===== AFC (8 equipos) =====
        teams.add(new Team(
                "Japón", "🇯🇵", "AFC", "Por sortear",
                "Hajime Moriyasu", "Tokio", "#17",
                "8 apariciones", "Octavos de final (2002, 2010, 2018, 2022)",
                "Estadio Nacional Japan",
                "Los Samurai Blue son la potencia dominante de Asia. Japón llega con una generación brillante que incluye jugadores de las mejores ligas europeas y busca dar el gran salto al superar los octavos de final."
        ));
        teams.add(new Team(
                "Corea del Sur", "🇰🇷", "AFC", "Por sortear",
                "Hong Myung-bo", "Seúl", "#23",
                "11 apariciones", "Semifinal (2002)",
                "Estadio Mundialista de Seúl",
                "Los Guerreros de Taeguk son históricos del fútbol asiático. Con Son Heung-min como estrella y una tradición mundialista sólida, Corea del Sur busca avanzar en la fase eliminatoria de 2026."
        ));
        teams.add(new Team(
                "Arabia Saudita", "🇸🇦", "AFC", "Por sortear",
                "Roberto Mancini", "Riad", "#55",
                "7 apariciones", "Segunda ronda (1994)",
                "Estadio Rey Fahd",
                "Las Águilas Verdes sorprendieron al derrotar a Argentina en Qatar 2022. Con la inversión masiva en fútbol que ha hecho el país, Arabia Saudita busca un mejor desempeño en el Mundial 2026."
        ));
        teams.add(new Team(
                "Australia", "🇦🇺", "AFC", "Por sortear",
                "Tony Popovic", "Canberra", "#24",
                "6 apariciones", "Semifinal (2006)",
                "Stadium Australia",
                "Los Socceroos llegan con el recuerdo brillante de Qatar 2022 donde llegaron a cuartos. Con Mathew Leckie y una mezcla de veteranos y jóvenes, Australia quiere repetir o superar esa hazaña."
        ));
        teams.add(new Team(
                "Irán", "🇮🇷", "AFC", "Por sortear",
                "Amir Ghalenoei", "Teherán", "#21",
                "7 apariciones", "Segunda ronda (2022)",
                "Estadio Azadi",
                "El equipo Melli es una de las potencias de Asia. Irán llega con un equipo competitivo y la experiencia de haber superado la segunda ronda en Qatar 2022, buscando avanzar aún más en 2026."
        ));
        teams.add(new Team(
                "Qatar", "🇶🇦", "AFC", "Por sortear",
                "Marquez López", "Doha", "#35",
                "2 apariciones", "Primera ronda (2022)",
                "Estadio Lusail",
                "Qatar clasifica como país miembro de la AFC. Los anfitriones del pasado Mundial buscan mejorar su actuación de 2022 donde quedaron eliminados en la fase de grupos sin ganar ningún partido."
        ));
        teams.add(new Team(
                "Uzbekistán", "🇺🇿", "AFC", "Por sortear",
                "Srecko Katanec", "Taskent", "#69",
                "1 aparición", "Primera ronda (1994)",
                "Estadio Bunyodkor",
                "Uzbekistán hace su regreso al Mundial tras 30 años de ausencia. Con una nueva generación de jugadores que están creciendo en el fútbol europeo, buscan dar la sorpresa en 2026."
        ));
        teams.add(new Team(
                "Irak", "🇮🇶", "AFC", "Por sortear",
                "Jesús Casas", "Bagdad", "#70",
                "1 aparición", "Primera ronda (1986)",
                "Estadio Al-Shaab",
                "Irak regresa al Mundial después de 40 años. Los Leones de Mesopotamia llegan con gran ilusión y un equipo rejuvenecido que busca hacer historia clasificando de la fase de grupos."
        ));

        // ===== OFC (1 equipo) =====
        teams.add(new Team(
                "Nueva Zelanda", "🇳🇿", "OFC", "Por sortear",
                "Darren Bazeley", "Wellington", "#98",
                "3 apariciones", "Segunda ronda (1982)",
                "Sky Stadium",
                "Los All Whites son el mejor equipo de Oceanía. Nueva Zelanda llega al Mundial 2026 con la ilusión de superar su actuación histórica en Sudáfrica 2010 donde igualaron con Italia y Paraguay."
        ));

        // ===== REPECHAJE (3 equipos adicionales para completar 48) =====
        teams.add(new Team(
                "Turquía", "🇹🇷", "UEFA", "Por sortear",
                "Vincenzo Montella", "Ankara", "#40",
                "3 apariciones", "Tercer lugar (2002)",
                "Estadio Atatürk",
                "La Cresent Star llega con el recuerdo glorioso de 2002 cuando alcanzaron el tercer puesto. Con Hakan Çalhanoğlu como capitán y un equipo rejuvenecido, Turquía busca recuperar ese nivel en 2026."
        ));
        teams.add(new Team(
                "Hungría", "🇭🇺", "UEFA", "Por sortear",
                "Marco Rossi", "Budapest", "#29",
                "9 apariciones", "Finalista (1938, 1954)",
                "Puskás Aréna",
                "Los Magiares regresan al Mundial tras décadas de ausencia. Hungría tuvo una de las mejores selecciones de la historia en los años 50 y busca revivir esa magia con una nueva generación de jugadores."
        ));
        teams.add(new Team(
                "Eslovenia", "🇸🇮", "UEFA", "Por sortear",
                "Matjaž Kek", "Liubliana", "#57",
                "2 apariciones", "Segunda ronda (2002)",
                "Stožice Stadium",
                "Eslovenia regresa al Mundial con Jan Oblak como gran estrella. El portero del Atlético de Madrid es considerado uno de los mejores del mundo y es el escudo fundamental de esta selección."
        ));

        return teams;
    }
}
