
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MatchingProjectManager from "./components/listers/MatchingProjectCards"
import MatchingProjectDetail from "./components/listers/MatchingProjectDetail"

import ContractContractManager from "./components/listers/ContractContractCards"
import ContractContractDetail from "./components/listers/ContractContractDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/matchings/projects',
                name: 'MatchingProjectManager',
                component: MatchingProjectManager
            },
            {
                path: '/matchings/projects/:id',
                name: 'MatchingProjectDetail',
                component: MatchingProjectDetail
            },

            {
                path: '/contracts/contracts',
                name: 'ContractContractManager',
                component: ContractContractManager
            },
            {
                path: '/contracts/contracts/:id',
                name: 'ContractContractDetail',
                component: ContractContractDetail
            },



    ]
})
