import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/projects',
      component: () => import('../components/ui/ProjectGrid.vue'),
    },
    {
      path: '/contracts',
      component: () => import('../components/ui/ContractGrid.vue'),
    },
  ],
})

export default router;
