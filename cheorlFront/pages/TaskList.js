import { TaskListCard } from "../components/TaskListCard.js"
import getTask from "../connections/helpers/getTask.js"


const TaskList = async () => {

    const tareas = await getTask()

    return(
    `
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-5">
                    <h1 class="text-center">Tareas</h1>
                </div>
            </div>
        </div>
        <div class="container mt-3">
            <div class="row">
                <div class="card-group">
                    ${
                        tareas.map(tareas =>
                            TaskListCard(tareas, false)).join('')} 
                </div>
            </div>
        </div>
    `)
}

export { TaskList }