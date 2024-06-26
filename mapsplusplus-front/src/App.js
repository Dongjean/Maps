import { useEffect } from 'react';
import { Routes, Route, useNavigate } from 'react-router-dom';

import NavBar from './Components/NavBar.js';
import MainPage from './Pages/MainPage.js';
import PageNotFoundPage from './Pages/PageNotFoundPage.js';

function App() {
    const navigate = useNavigate(); //navigate('/') to navigate to different routes

    return (
        <div>
            <NavBar />
            <Routes>
				<Route path='/' exact element={<MainPage />} />

                {/* Reroute to Page not found Page */}
                <Route path='*' exact element={<PageNotFoundPage GoHome={() => {navigate('/')}} />} />
			</Routes>
        </div>
    );
}

export default App;
