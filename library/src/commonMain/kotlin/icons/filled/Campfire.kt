package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Campfire: ImageVector
    get() {
        if (_Campfire != null) {
            return _Campfire!!
        }
        _Campfire = ImageVector.Builder(
            name = "Filled.Campfire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.252f, 2.996f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.857f, -0.183f)
                curveToRelative(1.736f, 0.762f, 2.57f, 2.275f, 2.97f, 3.502f)
                quadToRelative(0.071f, 0.223f, 0.127f, 0.435f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.137f, -1.549f)
                lineToRelative(0.074f, -0.03f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.947f, 0.472f)
                lineToRelative(0.488f, 1.428f)
                curveToRelative(0.162f, 0.5f, 0.314f, 1.016f, 0.418f, 1.529f)
                curveToRelative(0.2f, 0.975f, 0.255f, 2.025f, -0.113f, 3.051f)
                lineToRelative(-0.079f, 0.205f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.25f)
                curveToRelative(-3.04f, 0f, -5.5f, -2.472f, -5.5f, -5.517f)
                curveToRelative(0f, -2.897f, 1.162f, -4.188f, 2.67f, -6.628f)
                close()
                moveTo(18.843f, 15.267f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.314f, 1.466f)
                curveToRelative(-4.51f, 0.967f, -8.834f, 2.521f, -12.992f, 4.53f)
                lineToRelative(-0.83f, 0.408f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -1.342f)
                lineToRelative(0.848f, -0.417f)
                curveToRelative(4.252f, -2.053f, 8.689f, -3.65f, 13.33f, -4.645f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.081f, 15.254f)
                lineToRelative(0.076f, 0.013f)
                lineToRelative(0.928f, 0.207f)
                curveToRelative(4.315f, 1.004f, 8.427f, 2.517f, 12.401f, 4.437f)
                lineToRelative(0.849f, 0.418f)
                lineToRelative(0.067f, 0.038f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.667f, 1.334f)
                lineToRelative(-0.07f, -0.03f)
                lineToRelative(-0.831f, -0.408f)
                curveToRelative(-3.887f, -1.878f, -7.894f, -3.352f, -12.089f, -4.328f)
                lineToRelative(-0.902f, -0.202f)
                lineToRelative(-0.074f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.312f, -1.46f)
            }
        }.build()

        return _Campfire!!
    }

@Suppress("ObjectPropertyName")
private var _Campfire: ImageVector? = null
