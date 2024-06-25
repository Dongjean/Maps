import { useState } from 'react';

import '../CSS/NavBarStyles.css'

function NavBar() {
    const [LogoColour, setLogoColour] = useState('transparent');

    return (
        <div class='NavBarContainer'>
            <div
                class='Logo'

                onMouseEnter={() => {setLogoColour('darkgrey')}}
                onMouseLeave={() => {setLogoColour('transparent')}}

                onMouseDown={() => {setLogoColour('grey')}}
                onMouseUp={() => {setLogoColour('darkgrey')}}

                style={{backgroundColor: LogoColour, cursor: 'pointer'}}
            >
                <div class='LogoPlaceholderText'>
                    Maps++
                </div>
            </div>

            <div></div>

        </div>
    );
  }
  
  export default NavBar;
  