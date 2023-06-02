import { Nav } from "../layouts/Nav.js"
import { Footer } from "../layouts/Footer.js"

import { Error404 } from "../pages/Error404.js"
import { SignIn } from "../pages/SignIn.js"
import { SignUp } from "../pages/SignUp.js"
import { TaskCreate } from "../pages/TaskCreate.js"
import { TaskList } from "../pages/TaskList.js"

import getHash from "../connections/helpers/getHash.js"
import solveRoutes from "../connections/helpers/solveRoutes.js"

const Rutas = {
    "/": SignIn,
    "/registrarse": SignUp,
    "/creartarea": TaskCreate,
    "/tareas": TaskList
}

const App = async() => {

    const header = document.querySelector("header")
    const main = document.querySelector("main")
    const footer = document.querySelector("footer")

    header.innerHTML = await Nav()
    footer.innerHTML = await Footer()

    let ruta = await solveRoutes(getHash())
    let pagina = (Rutas[ruta]) ? Rutas[ruta] : Error404

    main.innerHTML = await pagina()
}

export { App }