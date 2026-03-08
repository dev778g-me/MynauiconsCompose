package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Yen: ImageVector
    get() {
        if (_Yen != null) {
            return _Yen!!
        }
        _Yen = ImageVector.Builder(
            name = "Outline.Yen",
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
                moveTo(17.455f, 12f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(6.545f)
                moveTo(12f, 12f)
                lineTo(6f, 3.5f)
                moveToRelative(6f, 8.5f)
                lineToRelative(6f, -8.5f)
                moveTo(12f, 12f)
                verticalLineToRelative(4.25f)
                moveToRelative(5.454f, 0f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(6.545f)
                moveToRelative(5.455f, 0f)
                verticalLineToRelative(4.25f)
            }
        }.build()

        return _Yen!!
    }

@Suppress("ObjectPropertyName")
private var _Yen: ImageVector? = null
