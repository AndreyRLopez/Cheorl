import { SignInForm } from "../components/SignInForm.js"

const SignIn = async () => {

    return (
        `
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-5">
                    <h1 class="text-center">Iniciar Sesión</h1>
                </div>
            </div>
        </div>
        ${SignInForm()}
        `
    )
}
    
export {SignIn}