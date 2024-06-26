import { useState } from 'react';

import '../CSS/PageNotFoundStyles.css';
import error404img from '../Images/404-error.png'

function PageNotFoundPage(props) {
    const [HomeButtColour, setHomeButtColour] = useState('blue');
    document.body.style.backgroundColor = 'red';

    return (
        <div className='PageContainer'>
            <style>{'body { background-color: red; }'}</style>
            <div className='Container'>
            <img className='ErrorIMG' src={error404img} />

            <div className='ErrorText'>Page Not Found :(</div>

            <div
                className='HomeButt'

                onMouseEnter={() => {setHomeButtColour('darkgrey')}}
                onMouseLeave={() => {setHomeButtColour('blue')}}

                onMouseDown={() => {setHomeButtColour('grey')}}
                onMouseUp={() => {setHomeButtColour('darkgrey'); props.GoHome()}}

                style={{backgroundColor: HomeButtColour, cursor: 'pointer'}}
            >
                <div className='HomeButtText'>Go back Home</div>
            </div>
            </div>
        </div>
    );
}

export default PageNotFoundPage;
