package es.fplumara.dam1.actividades.notas;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> registros = List.of(
                "123A;PROG;7.5",
                "123A;BBDD;6.0",
                "123A;PROG;8.0",
                "123A;LM;7.0",
                "123A;SIST;5.5",

                "999Z;PROG;9.0",
                "999Z;BBDD;7.0",
                "999Z;LM;8.5",
                "999Z;SIST;8.0",
                "999Z;PROG;9.5",

                "555B;PROG;4.5",
                "555B;BBDD;5.0",
                "555B;LM;6.0",
                "555B;SIST;4.0",
                "555B;PROG;3.5",

                "777K;PROG;6.5",
                "777K;BBDD;6.0",
                "777K;LM;6.5",
                "777K;SIST;7.0",
                "777K;BBDD;7.5",

                "888M;PROG;8.0",
                "888M;BBDD;8.0",
                "888M;LM;7.5",
                "888M;SIST;9.0",
                "888M;LM;8.5",

                "111Q;PROG;5.0",
                "111Q;BBDD;5.5",
                "111Q;LM;4.5",
                "111Q;SIST;6.0",
                "111Q;PROG;6.5",

                "222W;PROG;7.0",
                "222W;BBDD;7.5",
                "222W;LM;7.0",
                "222W;SIST;7.5",
                "222W;SIST;8.0",

                "333E;PROG;9.0",
                "333E;BBDD;9.0",
                "333E;LM;8.5",
                "333E;SIST;9.5",
                "333E;PROG;10.0",

                "444R;PROG;6.0",
                "444R;BBDD;6.5",
                "444R;LM;6.0",
                "444R;SIST;6.5",
                "444R;BBDD;4.0",

                // Unos cuantos extra para “ensuciar” y practicar:
                "123A;PROG;2.0",
                "999Z;LM;6.0",
                "555B;SIST;7.0",
                "777K;PROG;9.0",
                "888M;BBDD;4.0",
                "111Q;LM;9.0",
                "222W;PROG;3.0",
                "333E;SIST;7.0",
                "444R;LM;9.5"
        );

        Actividad actividad = new Actividad();
        actividad.parteA_MapList(registros);

//         Extra (cuando toque):
         actividad.parteB_MapMap_MaxPorAsignatura(registros);
    }
}
