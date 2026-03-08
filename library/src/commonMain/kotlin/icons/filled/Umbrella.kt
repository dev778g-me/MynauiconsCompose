package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Filled.Umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.25f, 13f)
                curveTo(1.25f, 7.063f, 6.063f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(22.75f, 7.063f, 22.75f, 13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.238f, 0.57f)
                curveToRelative(-1.22f, -1.046f, -2.01f, -1.418f, -2.694f, -1.418f)
                curveToRelative(-0.683f, 0f, -1.474f, 0.372f, -2.693f, 1.417f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.019f, -0.039f)
                curveToRelative(-0.838f, -0.838f, -1.622f, -1.312f, -2.356f, -1.5f)
                verticalLineToRelative(6.743f)
                curveToRelative(0f, 1.094f, -0.436f, 1.964f, -1.123f, 2.55f)
                curveToRelative(-0.67f, 0.572f, -1.538f, 0.839f, -2.377f, 0.839f)
                curveToRelative(-0.84f, 0f, -1.707f, -0.267f, -2.377f, -0.84f)
                curveToRelative(-0.687f, -0.585f, -1.123f, -1.455f, -1.123f, -2.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                curveToRelative(0f, 0.666f, 0.251f, 1.116f, 0.596f, 1.41f)
                curveToRelative(0.36f, 0.307f, 0.868f, 0.48f, 1.404f, 0.48f)
                reflectiveCurveToRelative(1.043f, -0.173f, 1.404f, -0.48f)
                curveToRelative(0.345f, -0.294f, 0.596f, -0.744f, 0.596f, -1.41f)
                verticalLineTo(12.03f)
                curveToRelative(-0.734f, 0.19f, -1.518f, 0.663f, -2.356f, 1.501f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.018f, 0.04f)
                curveToRelative(-1.22f, -1.046f, -2.01f, -1.418f, -2.694f, -1.418f)
                reflectiveCurveToRelative(-1.474f, 0.372f, -2.694f, 1.417f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 13f)
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null
