package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TwoHexagon: ImageVector
    get() {
        if (_TwoHexagon != null) {
            return _TwoHexagon!!
        }
        _TwoHexagon = ImageVector.Builder(
            name = "Filled.TwoHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(10.25f, 10.337f)
                curveToRelative(0f, -0.579f, 0.207f, -0.956f, 0.473f, -1.195f)
                curveToRelative(0.279f, -0.251f, 0.67f, -0.392f, 1.085f, -0.392f)
                reflectiveCurveToRelative(0.806f, 0.14f, 1.085f, 0.392f)
                curveToRelative(0.265f, 0.239f, 0.472f, 0.616f, 0.472f, 1.195f)
                curveToRelative(0f, 0.862f, -0.564f, 1.771f, -1.49f, 2.704f)
                curveToRelative(-0.692f, 0.698f, -1.484f, 1.313f, -2.195f, 1.864f)
                quadToRelative(-0.34f, 0.264f, -0.65f, 0.51f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.47f, 1.335f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.84f)
                curveToRelative(0.433f, -0.357f, 0.876f, -0.745f, 1.28f, -1.153f)
                curveToRelative(0.982f, -0.99f, 1.925f, -2.271f, 1.925f, -3.76f)
                curveToRelative(0f, -0.98f, -0.37f, -1.77f, -0.969f, -2.31f)
                curveToRelative(-0.587f, -0.528f, -1.349f, -0.777f, -2.088f, -0.777f)
                reflectiveCurveToRelative(-1.502f, 0.249f, -2.089f, 0.777f)
                curveToRelative(-0.6f, 0.54f, -0.969f, 1.33f, -0.969f, 2.31f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
            }
        }.build()

        return _TwoHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _TwoHexagon: ImageVector? = null
