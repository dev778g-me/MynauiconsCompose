package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Flame: ImageVector
    get() {
        if (_Flame != null) {
            return _Flame!!
        }
        _Flame = ImageVector.Builder(
            name = "Filled.Flame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.236f, 3.003f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.874f, -0.186f)
                curveToRelative(2.504f, 1.144f, 3.628f, 3.827f, 4.147f, 6.002f)
                curveToRelative(0.113f, 0.476f, 0.2f, 0.939f, 0.266f, 1.372f)
                curveToRelative(0.778f, -1.31f, 1.986f, -2.903f, 3.636f, -3.685f)
                lineToRelative(0.074f, -0.031f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, 0.476f)
                lineToRelative(0.358f, 1.078f)
                curveToRelative(0.367f, 1.105f, 0.746f, 2.278f, 0.974f, 3.44f)
                curveToRelative(0.289f, 1.465f, 0.359f, 2.999f, -0.152f, 4.482f)
                lineToRelative(-0.11f, 0.296f)
                curveToRelative(-1.168f, 2.921f, -3.943f, 5.003f, -7.21f, 5.003f)
                curveToRelative(-4.34f, 0f, -7.803f, -3.665f, -7.803f, -8.116f)
                curveToRelative(0f, -3.664f, 1.174f, -5.567f, 2.912f, -8.387f)
                curveToRelative(0.313f, -0.508f, 0.645f, -1.046f, 0.991f, -1.63f)
                close()
            }
        }.build()

        return _Flame!!
    }

@Suppress("ObjectPropertyName")
private var _Flame: ImageVector? = null
