import React from "react";
import InitialScreen from "./app/screens/InitialScreen";
import RequestDashboardScreen from "./app/screens/RequestDashboardScreen";
import RequestDetailScreen from "./app/screens/RequestDetailScreen";
import HelpRequestScreen from "./app/screens/HelpRequestScreen";
import CreateProductListScreen from "./app/screens/CreateProductListScreen";
import CheckListScreen from "./app/screens/CheckListScreen";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

const Stack = createStackNavigator();

const App = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen
          name="InitialScreen"
          component={InitialScreen}
          options={{
            title: "AyudaCompra",
          }}
        />

        <Stack.Screen
          name="RequestDashboardScreen"
          component={RequestDashboardScreen}
          options={{
            title: "Tablero de solicitudes",
          }}
        />

        <Stack.Screen
          name="RequestDetailScreen"
          component={RequestDetailScreen}
          options={{
            title: "Detalle de solicitud",
          }}
        />
        <Stack.Screen name = "HelpRequestScreen" 
          component={HelpRequestScreen} 
          options={{title:'Solicitar Ayuda en tu compra'}} 
        />
        <Stack.Screen name = "CreateProductListScreen" 
          component={CreateProductListScreen} 
          options={{title:'Añadir productos'}} 
        />
        <Stack.Screen
          name="CheckListScreen"
          component={CheckListScreen}
          options={{
            title: "CheckList",
          }}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default App;
