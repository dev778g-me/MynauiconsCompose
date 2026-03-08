package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudHail: ImageVector
    get() {
        if (_CloudHail != null) {
            return _CloudHail!!
        }
        _CloudHail = ImageVector.Builder(
            name = "Outline.CloudHail",
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
                moveTo(19.825f, 17f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
                moveTo(12f, 16.5f)
                verticalLineTo(15f)
                moveToRelative(4f, -0.5f)
                verticalLineTo(13f)
                moveToRelative(-8f, 1.5f)
                verticalLineTo(13f)
                moveToRelative(4f, 7.5f)
                verticalLineTo(19f)
                moveToRelative(4f, -0.5f)
                verticalLineTo(17f)
                moveToRelative(-8f, 1.5f)
                verticalLineTo(17f)
            }
        }.build()

        return _CloudHail!!
    }

@Suppress("ObjectPropertyName")
private var _CloudHail: ImageVector? = null
