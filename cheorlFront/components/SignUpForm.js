const SignUpForm = () => {

    const vista = 
    `
    <div class="container">
    <div class="row justify-content-center mt-2">
        <div class="col-md-5">
        <form class="container mt-3">
                <div class="form-group">
                  <label for="name">Nombres</label>
                  <input type="text" class="form-control" name="name" id="name" maxlength="30" pattern="[A-Za-z]+" required>
                </div>
                <div class="form-group">
                  <label for="lname">Apellidos</label>
                  <input type="text" class="form-control" name="lname" id="lname" maxlength="30" pattern="[A-Za-z]+" required>
                </div>
                <div class="form-group">
                  <br>
                    <label for="tipoDoc">Tipo de Documento</label>
                    <select name="tipoDoc" id="tipoDoc" class="form-control" required>
                      <option selected disabled>Selecciona tu Tipo</option>
                      <option value="admin">C.C.</option>
                      <option value="user">T.I.</option>
                      <option value="user">P.P.</option>
                    </select>
                </div>
                <div class="form-group">
                  <label for="doc">Documento</label>
                  <input type="number" class="form-control" name="doc" id="doc" minlength="8" maxlength="10" pattern="[0-9]+" required>
                </div>
                <div class="form-group">
                    <br>
                  <label for="email">Email</label>
                  <input placeholder="abc123@fesc.edu.co" type="email" class="form-control" name="email" id="email" required>
                </div>
                <div class="form-group">
                    <label for="password">Contraseña</label>
                    <input placeholder="**********" type="password" class="form-control" name="password" id="password" minlength="8" required>
                </div>
                <div class="form-group">
                  <br>
                    <label for="rol">Rol</label>
                    <select name="rol" id="rol" class="form-control" required>
                      <option selected disabled>Selecciona tu Rol</option>
                      <option value="admin">Administrador</option>
                      <option value="user">Usuario</option>
                    </select>
                </div>
                <div class="my-4 text-center">
                  <a href="#/" type="submit" class="btn btn-danger">
                    Registrarse
                  </a>
                </div>
            </form>
        </div>
    </div>
    </div>
    `
    return vista
}

export { SignUpForm }