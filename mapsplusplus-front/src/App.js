import {Routes, Route, useNavigate} from 'react-router-dom';

import NavBar from './Components/NavBar.js';
import MainPage from './Pages/MainPage.js';

function App() {
    const navigate = useNavigate(); //navigate('/') to navigate to different routes

    return (
        <div>
            <NavBar />
            <Routes>
				<Route path='/' exact element={<MainPage />}/>
			</Routes>
        </div>
    );
}

export default App;
