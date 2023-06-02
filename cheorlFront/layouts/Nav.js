const Nav = () => {
  const vista =
  `
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-5">
      <div class="container-fluid">
        <a class="navbar-brand m-3" href="#">CHEORL</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse ms-4" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" aria-current="page" href="#/creartarea/">Crear Tarea</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" aria-current="page" href="#/tareas/">Tareas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#/registrarse/">Registrarse</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#//">Iniciar sesion</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#/">Cerrar sesion</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>
  `    

  return vista
}

export { Nav }
