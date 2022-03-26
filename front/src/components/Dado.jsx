import React from "react";
const DadoLanzado = (props) => {
    const numDado=props.value;
    const rutaFoto ='/assets/num'+numDado+'.png';
    return (
        <>
        
        <br/>
            {props.value?(<img src={rutaFoto} alt={rutaFoto} width="50" height="50"/>):(<div></div>)}
        <br/>
        <br/>
            {props.value?("Número obtenido: "+numDado):(<div></div>)}
        </>
    );
};

export default DadoLanzado;