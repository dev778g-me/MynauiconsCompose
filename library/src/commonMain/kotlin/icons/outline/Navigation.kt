package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Navigation: ImageVector
    get() {
        if (_Navigation != null) {
            return _Navigation!!
        }
        _Navigation = ImageVector.Builder(
            name = "Outline.Navigation",
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
                moveTo(11.54f, 3.333f)
                arcToRelative(0.485f, 0.485f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, 0f)
                lineToRelative(6.5f, 16.916f)
                curveToRelative(0.178f, 0.464f, -0.272f, 0.917f, -0.685f, 0.69f)
                lineToRelative(-6.05f, -3.314f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 0f)
                lineToRelative(-6.05f, 3.315f)
                curveToRelative(-0.413f, 0.226f, -0.863f, -0.227f, -0.685f, -0.69f)
                close()
            }
        }.build()

        return _Navigation!!
    }

@Suppress("ObjectPropertyName")
private var _Navigation: ImageVector? = null
