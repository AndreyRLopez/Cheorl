INSERT
    IGNORE INTO rol(id, nombre)
values
    (1, "admininistrador"),
    (2, "Usuario");

INSERT
    IGNORE INTO documento(id, nombre)
values
    (1, "C.C"),
    (2, "T.I"),
    (3, "P.P");

INSERT
    IGNORE INTO estado_tarea(id, nombre)
values
    (1, "Pendiente"),
    (2, "Terminada"),
    (3, "Completada");
