const TaskCreateForm = () => {

    const vista = 
    `
    
    <div class="container">
        <div class="row justify-content-center mt-2">
            <div class="col-md-5">
            <form class="container mt-3">
                    <div class="form-group">
                      <label for="nombreT">Nombre de la Tarea</label>
                      <input type="text" class="form-control" name="nombreT" id="nombreT">
                    </div>
                    <div class="form-group mt-1">
                        <label for="descripcionT">Descripcion</label><br>
                        <textarea name="descripcionT" id="descripcionT" cols="55" rows="5"></textarea>
                    </div>
                    <div class="form-group mt-1">
                        <label for="archivoT">Agregar Archivos</label>
                        <input type="file" class="form-control" name="archivoT" id="archivoT">
                    </div>
                    <div class="form-group mt-3">
                        <label for="fechaLimiteT">Fecha Limite</label>
                        <input type="date" class="form-control" name="fechaLimiteT" id="fechaLimiteT">
                    </div>
                    <div class="form-group mt-1">
                      <br>
                        <label for="password">Asignar a: </label>
                        <select name="" id="" class="form-control">
                          <option selected disabled>Usuario...</option>
                          <option>Aaa Bbbb</option>
                        </select>
                    </div>
                    <div class="my-4 text-center mt-3">
                        <a href="#/tareas/" type="submit" class="btn btn-danger">Crear Tarea</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    `
    return vista
}

export { TaskCreateForm }