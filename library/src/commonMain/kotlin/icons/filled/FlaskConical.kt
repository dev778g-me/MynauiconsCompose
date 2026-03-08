package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FlaskConical: ImageVector
    get() {
        if (_FlaskConical != null) {
            return _FlaskConical!!
        }
        _FlaskConical = ImageVector.Builder(
            name = "Filled.FlaskConical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.841f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.303f)
                verticalLineToRelative(6.957f)
                lineToRelative(-3.46f, 3.75f)
                lineToRelative(-0.053f, 0.063f)
                quadToRelative(-0.118f, 0.158f, -0.268f, 0.354f)
                curveToRelative(-0.43f, 0.559f, -1.013f, 1.319f, -1.335f, 2.079f)
                curveToRelative(-0.207f, 0.488f, -0.347f, 1.06f, -0.242f, 1.653f)
                curveToRelative(0.11f, 0.618f, 0.467f, 1.156f, 1.059f, 1.587f)
                curveToRelative(0.456f, 0.333f, 1.034f, 0.448f, 1.658f, 0.502f)
                curveToRelative(0.627f, 0.055f, 1.44f, 0.055f, 2.455f, 0.055f)
                horizontalLineToRelative(6.084f)
                curveToRelative(1.016f, 0f, 1.828f, 0f, 2.455f, -0.055f)
                curveToRelative(0.624f, -0.054f, 1.202f, -0.17f, 1.658f, -0.502f)
                curveToRelative(0.592f, -0.431f, 0.95f, -0.97f, 1.06f, -1.587f)
                curveToRelative(0.105f, -0.594f, -0.036f, -1.165f, -0.243f, -1.653f)
                curveToRelative(-0.322f, -0.76f, -0.905f, -1.52f, -1.335f, -2.08f)
                quadToRelative(-0.15f, -0.194f, -0.268f, -0.353f)
                lineToRelative(-0.053f, -0.064f)
                lineToRelative(-3.46f, -3.75f)
                verticalLineTo(4.25f)
                horizontalLineToRelative(0.303f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _FlaskConical!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskConical: ImageVector? = null
