import Home from 'pages/Home';
import Dashboard from 'pages/Dashboard';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

const Rotas = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>} />
                    
                <Route path="/dashboard" element={<Dashboard/>}/>
                 
            </Routes>
        </BrowserRouter>

    );
}

export default Rotas;