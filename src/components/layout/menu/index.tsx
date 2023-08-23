//import React from "react";
//import { Interface } from "readline";
import Link from 'next/link'

export const Menu: React.FC = () => {
    return (
        <aside className="column is-2 is-narrow-mobile is-fullheight section is-hidden-mobile">
            <p className="menu-label is-hidden-touch">
                Minha Vendas
            </p>
            <ul className="menu-list">
                <MenuItem href="/" label="Home" />
                <MenuItem href="/" label="Cadastros" />
                <MenuItem href="/" label="Config" />
                <MenuItem href="/" label="Sair" />

            </ul>
        </aside>
    )
}

interface MenuItemProps {
    href: string;
    label: string;

}

const MenuItem: React.FC<MenuItemProps> = (props: MenuItemProps) => {
    return (
        <li>
            <Link legacyBehavior href={props.href}>
                <a>
                    <span className="icon"></span> { props.label }
                </a>
            </ Link>
        </li>
    )

}