package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pencil: ImageVector
    get() {
        if (_Pencil != null) {
            return _Pencil!!
        }
        _Pencil = ImageVector.Builder(
            name = "Outline.Pencil",
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
                moveTo(8.8f, 20.199f)
                arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.869f, 21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3.844f)
                curveToRelative(0f, -0.724f, 0.288f, -1.419f, 0.8f, -1.931f)
                moveToRelative(5f, 4.974f)
                lineToRelative(-5f, -4.974f)
                moveToRelative(5f, 4.974f)
                lineToRelative(9.974f, -9.978f)
                moveTo(3.8f, 15.225f)
                lineToRelative(9.984f, -9.995f)
                moveToRelative(0f, 0f)
                lineToRelative(1.426f, -1.428f)
                arcToRelative(2.733f, 2.733f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.867f, -0.001f)
                lineToRelative(1.126f, 1.127f)
                arcToRelative(2.733f, 2.733f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.865f)
                lineToRelative(-1.428f, 1.428f)
                moveTo(13.783f, 5.23f)
                lineToRelative(4.991f, 4.991f)
            }
        }.build()

        return _Pencil!!
    }

@Suppress("ObjectPropertyName")
private var _Pencil: ImageVector? = null
