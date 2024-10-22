import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import HomePage from '../views/HomePage.vue'
import PersonaPage from '../views/PersonaPage.vue';
import InicioPage from '../views/InicioPage.vue';

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/persona',
    name: 'Persona',
    component: PersonaPage
  },
  {
    path: '/card',
    name: 'Inicio',
    component: InicioPage
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
