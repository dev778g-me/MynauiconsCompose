package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ReceptionBell: ImageVector
    get() {
        if (_ReceptionBell != null) {
            return _ReceptionBell!!
        }
        _ReceptionBell = ImageVector.Builder(
            name = "Outline.ReceptionBell",
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
                moveTo(2.5f, 19.5f)
                horizontalLineToRelative(19f)
                moveTo(12f, 7.714f)
                verticalLineTo(4.5f)
                moveToRelative(0f, 3.214f)
                horizontalLineTo(9.889f)
                curveToRelative(-2.915f, 0f, -5.278f, 2.399f, -5.278f, 5.357f)
                verticalLineToRelative(3.215f)
                horizontalLineTo(19.39f)
                verticalLineTo(13.07f)
                curveToRelative(0f, -2.958f, -2.363f, -5.357f, -5.278f, -5.357f)
                close()
                moveTo(12f, 4.5f)
                horizontalLineTo(9.889f)
                moveTo(12f, 4.5f)
                horizontalLineToRelative(2.111f)
            }
        }.build()

        return _ReceptionBell!!
    }

@Suppress("ObjectPropertyName")
private var _ReceptionBell: ImageVector? = null
