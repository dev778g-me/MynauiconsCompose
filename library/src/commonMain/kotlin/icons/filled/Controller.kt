package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Controller: ImageVector
    get() {
        if (_Controller != null) {
            return _Controller!!
        }
        _Controller = ImageVector.Builder(
            name = "Filled.Controller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.032f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(3.715f)
                curveToRelative(0.428f, -0.109f, 0.867f, -0.296f, 1.371f, -0.51f)
                quadToRelative(0.219f, -0.094f, 0.455f, -0.192f)
                curveToRelative(0.952f, -0.395f, 2.122f, -0.801f, 3.441f, -0.374f)
                curveToRelative(1.37f, 0.444f, 2.474f, 1.472f, 3.203f, 3.157f)
                curveToRelative(0.718f, 1.66f, 1.081f, 3.97f, 1.024f, 7.062f)
                curveToRelative(-0.023f, 1.255f, -0.34f, 3.057f, -1.996f, 3.78f)
                curveToRelative(-1.789f, 0.782f, -3.198f, -0.024f, -4.296f, -0.774f)
                quadToRelative(-0.253f, -0.174f, -0.483f, -0.337f)
                curveToRelative(-0.376f, -0.265f, -0.72f, -0.507f, -1.089f, -0.714f)
                curveToRelative(-0.499f, -0.28f, -0.957f, -0.44f, -1.431f, -0.44f)
                lineTo(11.05f, 18.155f)
                curveToRelative(-0.475f, 0f, -0.935f, 0.16f, -1.435f, 0.44f)
                curveToRelative(-0.37f, 0.207f, -0.716f, 0.45f, -1.094f, 0.716f)
                quadToRelative(-0.229f, 0.162f, -0.48f, 0.334f)
                curveToRelative(-1.097f, 0.748f, -2.506f, 1.555f, -4.29f, 0.776f)
                curveToRelative(-1.656f, -0.724f, -1.973f, -2.526f, -1.996f, -3.78f)
                curveToRelative(-0.057f, -3.093f, 0.306f, -5.403f, 1.024f, -7.063f)
                curveToRelative(0.73f, -1.685f, 1.833f, -2.713f, 3.203f, -3.157f)
                curveToRelative(1.32f, -0.427f, 2.489f, -0.02f, 3.441f, 0.374f)
                quadToRelative(0.237f, 0.098f, 0.455f, 0.192f)
                curveToRelative(0.504f, 0.214f, 0.943f, 0.401f, 1.371f, 0.51f)
                lineTo(11.249f, 3.782f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveTo(8.25f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                lineTo(6f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                lineTo(9f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.75f)
                close()
                moveTo(14.874f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _Controller!!
    }

@Suppress("ObjectPropertyName")
private var _Controller: ImageVector? = null
