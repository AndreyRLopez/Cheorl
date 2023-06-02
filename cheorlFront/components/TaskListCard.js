const TaskListCard = (tareas, mitarea) => 
    `
                <div class="col-lg-4 col-md-6 col-ms-12 mt-2 mb-2 mx-2" style="width: 22rem;">
                    <div class="card">
                        <div class="card-header mi-card">
                            <div>
                                ${tareas.estadoT ?
                                    `<div class="mi-badge-terminada">Terminada</div>` : 
                                    `<div class="mi-badge-pendiente">Pendiente</div>`}
                            </div>
                            <div>
                                ${tareas.marcarT ?
                                    `<div>
                                        <input type="checkbox" id="scales" name="scales" checked>
                                        <label for="scales">Completa</label>
                                    </div>` :
                                    ""}
                            </div>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">
                                ${tareas.id}
                                Nombre: ${tareas.nombreT}
                            </h5>
                            <p class="card-text">
                                Fecha Limite: ${tareas.fechaLimiteT}
                            </p>
                            <div>
                                <p class="card-text">
                                    De: ${tareas.admin}
                                </p>
                            </div>
                            <div>
                                <p class="card-text">
                                    Para: ${tareas.usuario}
                                </p>
                            </div>
                                <button type="button" class="btn btn-danger fw-bold mt-3" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                    Más Detalles
                                </button>
                            <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h2 class="modal-title fs-5" id="staticBackdropLabel">Nombre: ${tareas.nombreT}</h2>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            Descripcion: ${tareas.descripcionT}
                                        </div>
                                        <div class="modal-footer">
                                            Fecha Subida: ${tareas.fechaSubidaT}
                                        </div>
                                        <div class="modal-footer">
                                            Fecha Limite: ${tareas.fechaLimiteT}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
    `

export { TaskListCard }