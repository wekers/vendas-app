const Mensagem = (props: any) => {
    return (
        <div>
            {props.mensagem}
        </div>
    )
}
//function MeuComponente() {
 //   return (
  //      <div>
//<Mensagem mensagem="mudei teste" />
 //       </div>
 //   )
//}

const MeuComponente = () => {
    return (
        <div>
            <Mensagem mensagem="mudei a msg" />
        </div>
    )

}

export default MeuComponente;