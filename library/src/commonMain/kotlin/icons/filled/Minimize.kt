package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Minimize: ImageVector
    get() {
        if (_Minimize != null) {
            return _Minimize!!
        }
        _Minimize = ImageVector.Builder(
            name = "Filled.Minimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 3.02f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 3f)
                curveToRelative(-0.04f, 2.84f, -0.275f, 4.098f, -1.089f, 4.91f)
                curveToRelative(-0.813f, 0.815f, -2.07f, 1.05f, -4.911f, 1.091f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.02f, 1.499f)
                curveToRelative(2.737f, -0.04f, 4.643f, -0.22f, 5.951f, -1.528f)
                reflectiveCurveTo(10.46f, 5.758f, 10.5f, 3.021f)
                moveTo(3.02f, 13.51f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, 1.5f)
                curveToRelative(2.842f, 0.04f, 4.099f, 0.274f, 4.912f, 1.088f)
                curveToRelative(0.814f, 0.814f, 1.048f, 2.071f, 1.09f, 4.913f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.499f, -0.022f)
                curveToRelative(-0.04f, -2.737f, -0.22f, -4.643f, -1.528f, -5.951f)
                reflectiveCurveToRelative(-3.214f, -1.489f, -5.951f, -1.528f)
                moveTo(15.01f, 2.999f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0.022f)
                curveToRelative(0.04f, 2.737f, 0.22f, 4.643f, 1.528f, 5.951f)
                reflectiveCurveToRelative(3.214f, 1.488f, 5.951f, 1.528f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.022f, -1.5f)
                curveToRelative(-2.842f, -0.041f, -4.099f, -0.275f, -4.913f, -1.089f)
                curveToRelative(-0.813f, -0.813f, -1.047f, -2.07f, -1.088f, -4.912f)
                moveToRelative(6f, 12.011f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.02f, -1.5f)
                curveToRelative(-2.738f, 0.04f, -4.644f, 0.22f, -5.952f, 1.528f)
                reflectiveCurveToRelative(-1.489f, 3.214f, -1.528f, 5.951f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0.022f)
                curveToRelative(0.04f, -2.842f, 0.274f, -4.099f, 1.088f, -4.913f)
                curveToRelative(0.814f, -0.813f, 2.071f, -1.047f, 4.913f, -1.088f)
            }
        }.build()

        return _Minimize!!
    }

@Suppress("ObjectPropertyName")
private var _Minimize: ImageVector? = null
