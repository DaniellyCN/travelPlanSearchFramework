<template>
  <div>
    <h2 id="page-heading" data-cy="TravelPlanHeading">
      <span v-text="$t('myappApp.travelPlan.home.title')" id="travel-plan-heading">Travel Plans</span>
    </h2>
    <search-entity ref="search-entity-travel-plan" searchBeanName="travelPlanDAO"> </search-entity>
  </div>
</template>

<script lang="ts" src="./travel-plan.component.ts"></script>
