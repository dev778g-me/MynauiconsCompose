package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sofa: ImageVector
    get() {
        if (_Sofa != null) {
            return _Sofa!!
        }
        _Sofa = ImageVector.Builder(
            name = "Outline.Sofa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 18f)
                verticalLineToRelative(2f)
                moveToRelative(9f, -2f)
                verticalLineToRelative(2f)
                moveTo(4.8f, 9.844f)
                curveTo(3.9f, 9.864f, 3f, 10.271f, 3f, 11f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, 1.209f, 3f, 2.7f, 3f)
                horizontalLineToRelative(12.6f)
                curveToRelative(1.491f, 0f, 2.7f, -1.343f, 2.7f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.812f, -0.9f, -1.176f, -1.8f, -1.156f)
                moveToRelative(-14.4f, 0f)
                curveToRelative(0.9f, -0.02f, 1.8f, 0.344f, 1.8f, 1.156f)
                curveToRelative(0f, 1.363f, 0.225f, 3f, 2f, 3f)
                horizontalLineToRelative(6.8f)
                curveToRelative(1.775f, 0f, 2f, -1.637f, 2f, -3f)
                curveToRelative(0f, -0.73f, 0.9f, -1.135f, 1.8f, -1.156f)
                moveToRelative(-14.4f, 0f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.657f, 1.209f, -3f, 2.7f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.491f, 0f, 2.7f, 1.343f, 2.7f, 3f)
                verticalLineToRelative(2.844f)
            }
        }.build()

        return _Sofa!!
    }

@Suppress("ObjectPropertyName")
private var _Sofa: ImageVector? = null
