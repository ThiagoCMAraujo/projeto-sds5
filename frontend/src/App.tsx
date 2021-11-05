import DataTable from "assets/components/dataTable/dataTable";
import Footer from "assets/components/footer";
import NavBar from "assets/components/navbar";

function App() {
  return (
    <>
      <NavBar/>
    <div className="container">
      <h1 className="text-primary" >"Olá, mundo!"</h1>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
