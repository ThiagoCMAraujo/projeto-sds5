import DataTable from "components/dataTable/dataTable";
import DonutChart from "components/donutChart/donutChart";
import Footer from "components/footer/footer";
import BarChart from "components/dataChart/barChart";
import NavBar from "components/navbar/navbar";

const Dashboard = () => {
    return (
        <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary" >Dashboard de Vendas</h1>

        <div className="row px-3 ">
          <div className="col-sm-6" >
            <h5 className="text-center text-secondary"> Taxa de Sucesso</h5>
            <BarChart />
          </div>

          <div className="col-sm-6" >
            <h5 className="text-center text-secondary" >Todas vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas Vendas</h2>

        </div>

        <DataTable />
      </div>
      <Footer />
    </>
    );
}

export default Dashboard;
