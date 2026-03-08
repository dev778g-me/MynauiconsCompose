package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TrashTwo: ImageVector
    get() {
        if (_TrashTwo != null) {
            return _TrashTwo!!
        }
        _TrashTwo = ImageVector.Builder(
            name = "Filled.TrashTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.108f, 5.75f)
                lineToRelative(0.064f, 0.042f)
                curveToRelative(0.252f, 0.154f, 0.666f, 0.32f, 1.243f, 0.47f)
                curveToRelative(1.144f, 0.296f, 2.766f, 0.488f, 4.585f, 0.488f)
                curveToRelative(1.82f, 0f, 3.44f, -0.192f, 4.585f, -0.489f)
                curveToRelative(0.578f, -0.15f, 0.991f, -0.315f, 1.243f, -0.47f)
                quadToRelative(0.037f, -0.021f, 0.064f, -0.041f)
                lineToRelative(-0.064f, -0.042f)
                curveToRelative(-0.252f, -0.154f, -0.665f, -0.32f, -1.243f, -0.47f)
                curveTo(15.44f, 4.943f, 13.819f, 4.75f, 12f, 4.75f)
                curveToRelative(-1.82f, 0f, -3.44f, 0.192f, -4.585f, 0.489f)
                curveToRelative(-0.577f, 0.15f, -0.991f, 0.315f, -1.243f, 0.47f)
                close()
                moveTo(4.506f, 5.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.006f, -0.12f)
                curveToRelative(0f, -0.657f, 0.5f, -1.082f, 0.889f, -1.32f)
                curveToRelative(0.431f, -0.265f, 1.006f, -0.477f, 1.65f, -0.643f)
                curveTo(8.338f, 3.45f, 10.092f, 3.25f, 12f, 3.25f)
                reflectiveCurveToRelative(3.662f, 0.2f, 4.961f, 0.537f)
                curveToRelative(0.644f, 0.166f, 1.219f, 0.378f, 1.65f, 0.642f)
                curveToRelative(0.39f, 0.239f, 0.89f, 0.664f, 0.89f, 1.321f)
                lineToRelative(-0.001f, 0.012f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.021f, 0.218f)
                lineToRelative(-1.715f, 12.091f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.852f, 1.924f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.704f, 1.187f)
                lineToRelative(-0.246f, 0.082f)
                arcToRelative(9.27f, 9.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.924f, 0f)
                lineToRelative(-0.246f, -0.082f)
                arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.704f, -1.187f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.852f, -1.925f)
                lineToRelative(-0.001f, -0.009f)
                lineTo(4.52f, 5.981f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.015f, -0.112f)
            }
        }.build()

        return _TrashTwo!!
    }

@Suppress("ObjectPropertyName")
private var _TrashTwo: ImageVector? = null
