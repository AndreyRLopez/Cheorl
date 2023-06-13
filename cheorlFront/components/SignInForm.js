const SignInForm = () => {

    const vista =
    `
    <div class="container">
    <div class="row justify-content-center mt-2">
        <div class="col-md-5">
        <form class="container mt-3">
                <div class="form-group">
                  <label for="email">Email</label>
                  <input placeholder="abc123@fesc.edu.co" type="email" class="form-control" name="email" id="email" required>
                </div>
                <div class="form-group">
                    <label for="password">Contraseña</label>
                    <input placeholder="**********" type="password" class="form-control" name="password" id="password">
                </div>
                <div class="form-group">
                  <br>
                    <label for="">Selecciona tu Rol</label>
                    <select name="" id="" class="form-control">
                      <option selected disabled>Rol...</option>
                      <option value="admin">Administrador</option>
                      <option value="user">Usuario</option>
                    </select>
                </div>
                <div class="my-4 text-center">
                  <a href="#/tareas/" type="button" class="btn btn-danger">
                    Iniciar Sesión
                  </a>
                </div>
            </form>
        </div>
    </div>
    </div>
    `

    return vista
}

export {SignInForm}
