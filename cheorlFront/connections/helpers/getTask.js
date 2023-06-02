const API= "https://10e546ae-f401-41e0-bf7c-39aea59c2142.mock.pstmn.io"

export default async (id)=> {

    const apiUrl= (id) ? `${API}${id}` : API

    try {
        
        const response= await fetch(apiUrl)
        const data= await response.json()

        return data

    } catch(error) {
        console.log("Error fetch ", error)
    }
}