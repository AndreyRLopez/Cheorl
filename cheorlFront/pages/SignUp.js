import { SignUpForm } from "../components/SignUpForm.js"

const SignUp = async () => {
   
    return (
        `
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-5">
                        <h1 class="text-center">Registrarse</h1>
                </div>
            </div>
        </div>    
        ${SignUpForm()}
        `
    )
}

export { SignUp }