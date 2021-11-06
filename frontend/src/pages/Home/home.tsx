import Footer from "assets/components/footer";
import NavBar from "assets/components/navbar";

const Home = () => {
    return (
        <>
        <NavBar/>
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                </div>
            </div>
            <Footer/>
        </>
    );
}

export default Home;
