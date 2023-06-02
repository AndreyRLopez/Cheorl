import { TaskCreateForm } from "../components/TaskCreateForm.js"

const TaskCreate = async () => 
    `
        <h1>Crear Tareas</h1>
        ${TaskCreateForm()}
    `

export { TaskCreate }