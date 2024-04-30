
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MatchingProjectManager from "./components/listers/MatchingProjectCards"
import MatchingProjectDetail from "./components/listers/MatchingProjectDetail"

import 계약ContractManager from "./components/listers/계약ContractCards"
import 계약ContractDetail from "./components/listers/계약ContractDetail"


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
                path: '/계약/contracts',
                name: '계약ContractManager',
                component: 계약ContractManager
            },
            {
                path: '/계약/contracts/:id',
                name: '계약ContractDetail',
                component: 계약ContractDetail
            },



    ]
})
