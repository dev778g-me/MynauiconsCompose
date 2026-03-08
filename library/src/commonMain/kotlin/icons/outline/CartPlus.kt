package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CartPlus: ImageVector
    get() {
        if (_CartPlus != null) {
            return _CartPlus!!
        }
        _CartPlus = ImageVector.Builder(
            name = "Outline.CartPlus",
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
                moveTo(10.5f, 10f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, -2f)
                verticalLineToRelative(4f)
                moveToRelative(4f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveToRelative(-8f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveTo(3.71f, 5.4f)
                horizontalLineToRelative(15.214f)
                curveToRelative(1.378f, 0f, 2.373f, 1.27f, 1.995f, 2.548f)
                lineToRelative(-1.654f, 5.6f)
                curveTo(19.01f, 14.408f, 18.196f, 15f, 17.27f, 15f)
                lineTo(8.112f, 15f)
                curveToRelative(-0.927f, 0f, -1.742f, -0.593f, -1.996f, -1.452f)
                close()
                moveTo(3.71f, 5.4f)
                lineTo(3f, 3f)
            }
        }.build()

        return _CartPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CartPlus: ImageVector? = null
